/*
 * Copyright (c) 2017. Dark Phoenixs (Open-Source Organization).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.darkphoenixs.rocketmq.consumer;

import org.darkphoenixs.mq.exception.MQException;

import java.util.List;
import java.util.Map;

/**
 * <p>Title: MessageConsumer</p>
 * <p>Description: 消息消费者</p>
 *
 * @author Victor
 * @version 1.0
 * @see AbstractConsumer
 * @since 2017/12/10
 */
public class MessageConsumer<T> extends AbstractConsumer<T> {

    @Override
    protected void doReceive(T message) throws MQException {

        System.out.println(message);
    }

    @Override
    protected void doReceive(List<T> messages) throws MQException {

        System.out.println(messages);
    }

    @Override
    protected void doReceive(String key, T message) throws MQException {

        System.out.println(key + ":" + message);
    }

    @Override
    protected void doReceive(Map<String, T> messages) throws MQException {

        System.out.println(messages);
    }
}
