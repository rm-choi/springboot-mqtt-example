package sun.woo.choi.vo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PubData {

    private String topic;
    private String payload;
}
