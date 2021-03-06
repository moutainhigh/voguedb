/**
 * @project voguedb  V1.0
 * @filename: RpcServer.java 2020年7月31日
 * Copyright(c) 2020 kinbug Co. Ltd. 
 * All right reserved. 
 */
package com.github.kinbug.voguedb.rpc;

import com.github.kinbug.voguedb.rpc.entity.Request;
import com.github.kinbug.voguedb.rpc.entity.Response;

/**
 * @ClassName: RpcServer
 * @Description: TODO(类描述)
 * @author kinbug
 * @date 2020年7月31日
 */
public interface Server {

    void start();

    void stop();

    Response<?> handlerRequest(Request<?> request);

}

