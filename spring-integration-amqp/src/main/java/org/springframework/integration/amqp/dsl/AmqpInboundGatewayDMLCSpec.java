/*
 * Copyright 2017 the original author or authors.
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

package org.springframework.integration.amqp.dsl;

import java.util.function.Consumer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.listener.DirectMessageListenerContainer;

/**
 * Spec for a gateway with a {@link DirectMessageListenerContainer}.
 *
 * @author Gary Russell
 * @since 5.0
 *
 */
public class AmqpInboundGatewayDMLCSpec
		extends AmqpInboundGatewaySpec<AmqpInboundGatewayDMLCSpec, DirectMessageListenerContainer> {

	AmqpInboundGatewayDMLCSpec(DirectMessageListenerContainer listenerContainer, AmqpTemplate amqpTemplate) {
		super(listenerContainer, amqpTemplate);
	}

	AmqpInboundGatewayDMLCSpec(DirectMessageListenerContainer listenerContainer) {
		super(listenerContainer);
	}

	public AmqpInboundGatewayDMLCSpec configureContainer(Consumer<DirectMessageListenerContainerSpec> configurer) {
		configurer.accept(new DirectMessageListenerContainerSpec(this.listenerContainer));
		return this;
	}

}