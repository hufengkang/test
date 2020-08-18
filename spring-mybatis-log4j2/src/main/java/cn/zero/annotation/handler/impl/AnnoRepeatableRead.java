package cn.zero.annotation.handler.impl;

import org.springframework.stereotype.Component;

import cn.zero.annotation.handler.AnnoHandler;
import cn.zero.annotation.handler.AnnoMapping;

@AnnoMapping(value="repeatableRead")
@Component
public class AnnoRepeatableRead implements AnnoHandler{

}