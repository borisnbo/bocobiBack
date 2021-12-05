
package com.bocobi.back.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.User;


public interface UserRepos extends JpaRepository<User, Integer> {

	User findByusername(String username);

}
