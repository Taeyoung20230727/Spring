package kr.co.ch09.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class MainController {

    @GetMapping
    public String index(){
            return "/index";
        }

        @GetMapping("/user1/list")
        public String user1list(){
        log.info("MainController/user1list");
            return "/user1/list";
        }


        @GetMapping("/user1/register")
        public String user1register(){
            log.info("MainController/user1register");
            return "user1/register";
        }


    @GetMapping("/user1/modify")
    public String user1Modify(){
        log.info("MainController/user1modify");
        return "user1/modify";
    }

    @GetMapping("/user2/list")
    public String user2list(){
        return "/user2/list";
    }


    @GetMapping("/user2/register")
    public String user2register(){
        return "user2/register";
    }


    @GetMapping("/user2/modify")
    public String user2Modify(){
        return "user2/modify";
    }


    @GetMapping("/user3/list")
    public String user3list(){
        return "/user3/list";
    }


    @GetMapping("/user3/register")
    public String user3register(){
        return "user3/register";
    }


    @GetMapping("/user3/modify")
    public String user3Modify(){
        return "user3/modify";
    }

    @GetMapping("/user4/list")
    public String user4list(){
        return "/user4/list";
    }


    @GetMapping("/user4/register")
    public String user4register(){
        return "user4/register";
    }


    @GetMapping("/user4/modify")
    public String user4Modify(){
        return "user4/modify";
    }

    @GetMapping("/user5/list")
    public String user5list(){
        return "/user5/list";
    }


    @GetMapping("/user5/register")
    public String user5register(){
        return "user5/register";
    }


    @GetMapping("/user5/modify")
    public String user5Modify(){
        return "user5/modify";
    }

}