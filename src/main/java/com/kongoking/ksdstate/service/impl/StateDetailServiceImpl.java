package com.kongoking.ksdstate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kongoking.ksdstate.entity.StateDetail;
import com.kongoking.ksdstate.mapper.StateDetailMapper;
import com.kongoking.ksdstate.service.StateDetailService;
import org.springframework.stereotype.Service;

/**
 * @author luonianxin
 * @Description 统计项明细数据库查询服务
 * @Date 2021/5/9
 */
@Service
public class StateDetailServiceImpl extends ServiceImpl<StateDetailMapper,StateDetail> implements StateDetailService {
}

