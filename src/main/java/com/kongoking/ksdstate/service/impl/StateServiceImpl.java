package com.kongoking.ksdstate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kongoking.ksdstate.entity.State;
import com.kongoking.ksdstate.mapper.StateMapper;
import com.kongoking.ksdstate.service.StateService;
import org.springframework.stereotype.Service;

/**
 * State状态统计服务类
 *
 * @author luonianxin
 * @Date 2021/5/2
 */
@Service
public class StateServiceImpl extends ServiceImpl<StateMapper, State> implements StateService {
}


