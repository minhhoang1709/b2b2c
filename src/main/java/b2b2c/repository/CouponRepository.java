package b2b2c.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import b2b2c.model.CouponModel;

@Repository
public interface CouponRepository extends JpaRepository<CouponModel, Integer> {
	public CouponModel findByCouponCode(String couponCode);
}
