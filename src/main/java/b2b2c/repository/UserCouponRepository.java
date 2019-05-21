package b2b2c.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import b2b2c.model.UserCouponModel;

@Repository
public interface UserCouponRepository extends JpaRepository<UserCouponModel, Integer> {

	public UserCouponModel findByCouponCode(String couponCode);

	int countByCouponCode(String couponCode);
}
