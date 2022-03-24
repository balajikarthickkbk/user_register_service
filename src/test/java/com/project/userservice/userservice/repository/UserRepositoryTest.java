package com.project.userservice.userservice.repository;

import com.project.userservice.userservice.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    UserRepository repository;

    @Test
    public void saveUser_userExists_userDetailsSaved() {
        User user = repository.save(new User("John", "Abraham", "joh2014@yahoo.com"));
        assertThat(user).hasFieldOrPropertyWithValue("firstName", "John");
        assertThat(user).hasFieldOrPropertyWithValue("surName", "Abraham");
        assertThat(user).hasFieldOrPropertyWithValue("emailAddress", "joh2014@yahoo.com");
    }

    @Test
    public void findUserBySurName_ifSurNameIsPresent_returnUserDetails() {
        User user1 = new User("John", "Abraham", "joh2014@yahoo.com");
        entityManager.persist(user1);
        User user2 = new User("David", "Warner", "david0104@yahoo.com");
        entityManager.persist(user2);
        User foundSurName = repository.findUserBySurName(user2.getSurName());
        assertThat(foundSurName).isEqualTo(user2);
    }


}

