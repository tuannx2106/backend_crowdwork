package app.services;

import app.repository.UserRepository;
import app.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<Users> findUser(Integer id){
        return userRepository.findUsersById(id);
    }

    public List<Users> findAll(){
//        List<Users> users = new ArrayList<Users>();
//        users.addAll(userRepository.findAllUsers());
        //tuong duong
//        for (UsersRecruiter usersRecruiter: usersRecruiterReponsitory.findAll()){
//            usersRecruiters.add(usersRecruiter);
//        }
        return userRepository.findAllUsers();
    }

    public void save(Users users){
        userRepository.save(users);
    }

//    public void update1(Users users){
//        userRepository.updateUser(users.getId(),users.getName(),users.getUpdateTime());
//    }

    public Boolean update(Users users){
        List<Users> user = findUser(users.getId());
        if(!user.isEmpty()) {
            Users existinguser = user.get(0);
            if (users.getName() != null){
                existinguser.setName(users.getName());
            }
            if(users.getAddress() != null){
                existinguser.setAddress(users.getAddress());
            }
            if(users.getAvatar() != null){
                existinguser.setAvatar(users.getAvatar());
            }
            if(users.getCmnd() != null){
                existinguser.setCmnd(users.getCmnd());
            }
            if (users.getDate_of_birth() != null){
                existinguser.setDate_of_birth(users.getDate_of_birth());
            }
            if(users.getEmail() != null){
                existinguser.setEmail(users.getEmail());
            }
            if(users.getVerifyEmail() != null){
                existinguser.setVerifyEmail(users.getVerifyEmail());
            }
            userRepository.save(existinguser);
            return true;
        }
        return false;
    }

    public Boolean delete(Integer id){
        //        userRepository.deleteById(id);
        List<Users> user = findUser(id);
        if(!user.isEmpty()) {
            Users existinguser = user.get(0);
            existinguser.setDelFlag(true);
            userRepository.save(existinguser);
            return true;
        }
        return false;
    }
}
