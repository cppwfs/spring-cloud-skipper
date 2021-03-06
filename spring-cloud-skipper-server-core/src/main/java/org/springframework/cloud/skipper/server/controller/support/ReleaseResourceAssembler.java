/*
 * Copyright 2018 the original author or authors.
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
package org.springframework.cloud.skipper.server.controller.support;

import org.springframework.cloud.skipper.domain.Release;
import org.springframework.cloud.skipper.server.controller.ReleaseController;
import org.springframework.hateoas.Resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author Mark Pollack
 */
public class ReleaseResourceAssembler extends SimpleResourceAssembler<Release> {

	@Override
	protected void addLinks(Resource<Release> resource) {
		super.addLinks(resource);
		resource.add(linkTo(methodOn(ReleaseController.class).status(null)).withRel("status"));
	}
}
