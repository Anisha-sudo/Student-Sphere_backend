package com.example.outreach_portal.service.Implementation;


import com.example.outreach_portal.bean.User;
import com.example.outreach_portal.dao.SaveUserDao;
import com.example.outreach_portal.service.SaveUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveUserImpl implements SaveUserService {

@Autowired
SaveUserDao saved;


@Override
public String saveuser(User obj){

    User user = new User();

    user.setUser_id(obj.getUser_id());
    user.setAbout(obj.getAbout());
    user.setBatch(obj.getBatch());
    user.setName(obj.getName());
    user.setEmail(obj.getEmail());
    user.setInterest(obj.getInterest());
    user.setPassword(obj.getPassword());
   user.setRole(obj.isRole());
    user.setProgram(obj.getProgram());
    user.setProfile_pic(obj.getProfile_pic());
//    user.setStatus(obj.getStatus());
    user.setRoll_no(obj.getRoll_no());

    saved.save(user);

    return "sucess";
}
}
