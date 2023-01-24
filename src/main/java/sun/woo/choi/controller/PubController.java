package sun.woo.choi.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.woo.choi.config.MqttConfig;
import sun.woo.choi.vo.PubData;


@RestController
@RequiredArgsConstructor
@RequestMapping("/pub")
public class PubController {

    private final MqttConfig.OutboundGateway outboundGateway;

    @PostMapping("/data")
    public void sendData(@RequestBody PubData pubData) throws Exception {

        outboundGateway.sendToMqtt(pubData.getPayload(), pubData.getTopic());
    }


}
