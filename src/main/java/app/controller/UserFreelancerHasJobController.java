package app.controller;

import app.model.UserFreelancerHasJob;
import app.services.UserFreelancerHasJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserFreelancerHasJobController {

    @Autowired
    UserFreelancerHasJobService userFreelancerHasJobService;

    @RequestMapping(value = "/userfreelancerhasjob/list", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<UserFreelancerHasJob> findAllUserFreelancerHasJob(){
        return userFreelancerHasJobService.findAllUserFreelancerHasJob();
    }

    @RequestMapping(value = "/userfreelancerhasjob/{f_id}/{j_id}", //
            method = RequestMethod.GET, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Optional<UserFreelancerHasJob> findUserFreelancerHasJob(@PathVariable Integer f_id, @PathVariable Integer j_id){
        return userFreelancerHasJobService.findUserFreelancerHasJob(f_id, j_id);
    }

    @RequestMapping(value = "/userfreelancerhasjob", //
            method = RequestMethod.POST, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String saveUserFreelancerHasJob(@RequestBody UserFreelancerHasJob userFreelancerHasJob){
        userFreelancerHasJobService.save(userFreelancerHasJob);
        return "FreelancerHasJob Saved!";
    }

    @RequestMapping(value = "/userfreelancerhasjob", //
            method = RequestMethod.PUT, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String updateUserFreelancerHasJob(@RequestBody UserFreelancerHasJob userFreelancerHasJob){
        userFreelancerHasJobService.update(userFreelancerHasJob);
        return "FreelancerHasJob Updated!";
    }

    @RequestMapping(value = "/userfreelancerhasjob/{f_id}/{j_id}", //
            method = RequestMethod.DELETE, //
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String deleteUserFreelancerHasJob(@PathVariable Integer f_id, @PathVariable Integer j_id){
        userFreelancerHasJobService.delete(f_id, j_id);
        return "FreelancerHasJob Deleted!";
    }

}
