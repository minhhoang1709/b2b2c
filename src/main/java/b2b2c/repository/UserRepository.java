package b2b2c.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import b2b2c.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {
	@Query(value="SELECT * FROM tbluser WHERE user_name =:user_name AND user_pass=:user_pass", nativeQuery = true)
	UserModel loginByUserNameAndUserPass(@Param("user_name") String userName, @Param("user_pass") String userPass);
	
	@Query(value="SELECT COUNT(*) FROM tbluser WHERE user_name =:user_name", nativeQuery = true)
	int checkRegister(@Param("user_name") String userName);
}
