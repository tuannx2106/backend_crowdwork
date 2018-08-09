package app.controller;

import app.model.ProfessionJob;
import app.services.ProfessionJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class ProfessionJobController {
    @Autowired
    ProfessionJobService professionJobService;

    //show List
    @RequestMapping(value = "/professionJoblist",
            method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public ArrayList<ProfessionJob> getProfessionJobList() {
        ArrayList<ProfessionJob> list = professionJobService.findAll();
        return list;
    }

    //Find particular
    @RequestMapping(value = "/professionJob/{professionJobId}", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Optional<ProfessionJob> getProfessionJob(@PathVariable("professionJobId") String professionJobId) {
        return professionJobService.getProfessionJob(Integer.valueOf(professionJobId));
    }

    //Add
    @RequestMapping(value = "/professionJob", //
            method = RequestMethod.POST, //
            produces = { MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ProfessionJob addProfessionJob(@RequestBody ProfessionJob professionJob) {

        System.out.println("(Service Side) Creating: " + professionJob.getId());
        professionJobService.addProfessionJob(professionJob);
        return professionJob;
    }

    //Edit
    @RequestMapping(value = "/professionJob", //
            method = RequestMethod.PUT, //
            produces = { MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ProfessionJob updateProfessionJob(@RequestBody ProfessionJob professionJob) {

        System.out.println("(Service Side) Editing: " + professionJob.getId());
        professionJobService.editProfessionJob(professionJob);
        return professionJob;
    }

    //Delete
    @RequestMapping(value = "/professionJob/{professionJobId}", //
            method = RequestMethod.DELETE, //
            produces = { MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public void deleteProfessionJob(@PathVariable("professionJobId") String professionJobId) {

        System.out.println("(Service Side) Deleting: " + professionJobId);

        professionJobService.deleteProfessionJob(Integer.valueOf(professionJobId));
    }
}
