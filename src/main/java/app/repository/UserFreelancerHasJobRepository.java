package app.repository;

import app.model.Identity.UserFreelancerHasJobIdentity;
import app.model.UserFreelancerHasJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserFreelancerHasJobRepository extends JpaRepository<UserFreelancerHasJob, UserFreelancerHasJobIdentity> {

    List<UserFreelancerHasJob> findByUserFreelancerHasJobIdentityAndDelFlag(UserFreelancerHasJobIdentity userFreelancerHasJobIdentity, Boolean delFlag);

    List<UserFreelancerHasJob> findAllByDelFlag(Boolean delFlag);
}
