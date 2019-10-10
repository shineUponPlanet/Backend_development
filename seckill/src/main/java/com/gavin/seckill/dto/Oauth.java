package com.gavin.seckill.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class Oauth implements Serializable {
    private Long id;

    private String oauthName;

    private String openid;

    private String nickname;

    private Byte gender;

    private String headImgUrl;

    private String country;

    private String province;

    private String city;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}