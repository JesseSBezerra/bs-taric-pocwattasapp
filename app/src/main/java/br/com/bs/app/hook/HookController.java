package br.com.bs.app.hook;

import br.com.bs.app.payload.ZMessageHookResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/z-hook")
@Log4j2
public class HookController {

    @PostMapping
    public void reiciveHook(@RequestBody ZMessageHookResponse response){
      log.info(response);
    }
}
