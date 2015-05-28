package com.aes.controller;

import com.aes.model.UserDetails;
import com.aes.service.EmpireService;
import com.aes.service.UService;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author RCBG
 */

@Controller
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UService service;
    
    @Autowired
    private EmpireService e_service;
    
    @RequestMapping(value="/home")
    public String setupForm(Map<String, Object> map, HttpServletRequest request){
        HttpSession session=request.getSession();
        int userID=(int)session.getAttribute("userID");
        UserDetails usr = new UserDetails();
        usr.setUserId(userID);
        UserDetails user=service.getUserDetails(usr);
        map.put("userName",user.getUserName());
        //map.put("userCourses", user.getCourses());
        return "../../user/home";
    }
    
    @RequestMapping(value="/view_profile", method=RequestMethod.GET)
     public String setupForm2 (Map<String, Object> map, HttpServletRequest request){
        HttpSession session=request.getSession();
        int userID=(int)session.getAttribute("userID");
        UserDetails usr = new UserDetails();
        usr.setUserId(userID);
        UserDetails user=service.getUserDetails(usr);
        map.put("firstName",user.getFirstName());
        map.put("middleName",user.getMiddleName());
        map.put("lastName",user.getLastName());
        map.put("userName",user.getUserName());
        map.put("userBU", e_service.getUnitNameById(user.getBusinessUnit().getBusinessUnitId()));
        map.put("position",user.getPosition());
        map.put("email",user.getEmail());
        return "../../user/profile/view_profile";
    }
   
    @RequestMapping(value="/edit_profile", method=RequestMethod.GET)
    public String setupForm3 (@ModelAttribute UserDetails loggedUser, Map<String, Object> map,
            HttpServletRequest request){
        HttpSession session=request.getSession();
        int userID=(int)session.getAttribute("userID");
        UserDetails usr = new UserDetails();
        usr.setUserId(userID);
        UserDetails user=service.getUserDetails(usr);
        //map.put("tempUser",user);
        map.put("firstName",user.getFirstName());
        map.put("middleName",user.getMiddleName());
        map.put("lastName",user.getLastName());
        map.put("userName",user.getUserName());
        map.put("businessUnit", e_service.getAllBusinessUnit());
        map.put("userBU", e_service.getUnitNameById(user.getBusinessUnit().getBusinessUnitId()));
        map.put("businessUnits", e_service.getAllBusinessUnit());
        map.put("position",user.getPosition());
        map.put("email",user.getEmail());
        //map.put("userType",service.getTypeNameById(user.getUserType().getUserTypeId()));
        return "../../user/profile/edit_profile";
    }
    
    @RequestMapping(value="/change_password", method=RequestMethod.GET)
    public String setupForm4 (@ModelAttribute UserDetails loggedUser, Map<String, Object> map,
            HttpServletRequest request){
        HttpSession session=request.getSession();
        int userID=(int)session.getAttribute("userID");
        UserDetails usr = new UserDetails();
        usr.setUserId(userID);
        UserDetails user=service.getUserDetails(usr);
        map.put("userName",user.getUserName());
        map.put("old_pw", user.getPassword());
        return "../../user/profile/change_password";
    }
    
    @RequestMapping(value="/useractions", method=RequestMethod.POST)
    public String doActions(Map<String, Object> map,
            HttpServletRequest request, @RequestParam String email, @RequestParam String buChosen, 
            @RequestParam String firstname, @RequestParam String middlename, 
            @RequestParam String lastname, @RequestParam String position,
            @RequestParam String action, @RequestParam String old_pw, 
            @RequestParam String new_pw, @RequestParam String confirm_pw){
        HttpSession session=request.getSession();
        int userID=(int)session.getAttribute("userID");
        UserDetails usr = new UserDetails();
        usr.setUserId(userID);
        UserDetails user=service.getUserDetails(usr);
        switch(action.toLowerCase()){
            case "edit":
                user.setFirstName(firstname);
                user.setMiddleName(middlename);
                user.setLastName(lastname);
                user.setEmail(email);
                user.setBusinessUnit(e_service.getBusinessUnit(Integer.parseInt(buChosen)));
                user.setPosition(position);
                service.updateProfile(user);
                break;
            case "change_password":
                
                String password=user.getPassword();
                if(password.equals(old_pw)&&new_pw.equals(confirm_pw)){
                    user.setPassword(new_pw);
                    service.updateProfile(user);
                }else{
                    map.put("userName",user.getUserName());
                    return "../../user/profile/change_password";
                }
                break;
        }
        map.put("userName",user.getUserName());
        return "../../user/home";
    }
    
    @RequestMapping(value="/past_exams", method=RequestMethod.GET)
    public String setupForm5(@ModelAttribute UserDetails loggedUser, Map<String, Object> map,
            HttpServletRequest request){
        HttpSession session=request.getSession();
        int userID=(int)session.getAttribute("userID");
        UserDetails usr = new UserDetails();
        usr.setUserId(userID);
        UserDetails user=service.getUserDetails(usr);
        map.put("userName",user.getUserName());
        return "../../user/exam/past_exams";
    }
    
    @RequestMapping(value="/upcoming_exams", method=RequestMethod.GET)
    public String setupForm6(@ModelAttribute UserDetails loggedUser, Map<String, Object> map,
            HttpServletRequest request){
        HttpSession session=request.getSession();
        int userID=(int)session.getAttribute("userID");
        UserDetails usr = new UserDetails();
        usr.setUserId(userID);
        UserDetails user=service.getUserDetails(usr);
        map.put("userName",user.getUserName());
        return "../../user/exam/upcoming_exams";
    }
    
    @RequestMapping(value="/past_courses", method=RequestMethod.GET)
    public String setupForm7(@ModelAttribute UserDetails loggedUser, Map<String, Object> map,
            HttpServletRequest request){
        HttpSession session=request.getSession();
        int userID=(int)session.getAttribute("userID");
        UserDetails usr = new UserDetails();
        usr.setUserId(userID);
        UserDetails user=service.getUserDetails(usr);
        map.put("userName",user.getUserName());
        return "../../user/past_courses";
    }
}
