package kr.co.ch05.controller;

import kr.co.ch05.dto.ParentDTO;
import kr.co.ch05.dto.memberDTO;
import kr.co.ch05.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService service;

    public MemberController(MemberService service){
        this.service = service;
    }

    @ResponseBody
    @GetMapping("/member/parents")
    public void parent(){
        List<ParentDTO> parents =  service.selectParentWithChild();

        System.out.println(parents);

        for(ParentDTO parent : parents){
            System.out.println(parent.getChilds());
        }
    }

    @GetMapping("/member/search")
    public String search(@RequestParam("type") String type,
                         @RequestParam("value") String value,
                         @RequestParam(value = "pos", required = false) String[] pos,
                         Model model){



        List<memberDTO> members = service.selectMembersForSearch(type, value, pos);
        System.out.println(members);

        model.addAttribute("members", members);

        return "/member/list";
    }


    @GetMapping("/member/list")
    public String list(Model model){
        List<memberDTO> members = service.selectMembers();
        model.addAttribute("members", members);
        return "/member/list";
    }

    @GetMapping("/member/register")
    public String register(){
        return "/member/register";
    }

    @PostMapping("/member/register")
    public String register(memberDTO memberDTO){
        System.out.println(memberDTO);

        service.insertMember(memberDTO);

        return "redirect:/member/list";

    }

    @GetMapping("/member/modify")
    public String modify(@RequestParam("uid") String uid, Model model){
        System.out.println("uid : " + uid);

        memberDTO memberDTO = service.selectMember(uid);
        model.addAttribute(memberDTO);

        return "/member/modify";
    }

    @PostMapping("/member/modify")
    public String modify(memberDTO memberDTO){
        service.updateMember(memberDTO);
        return "redirect:/member/list";
    }


    @GetMapping("/member/delete")
    public String delete(@RequestParam("uid") String uid){
        service.deleteMember(uid);

        return "redirect:/member/list";
    }


}
