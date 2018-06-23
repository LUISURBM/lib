/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package org.icefaces.samples.showcase.example.ace.panel;

import org.icefaces.samples.showcase.metadata.annotation.*;
import org.icefaces.samples.showcase.metadata.context.ComponentExampleImpl;

import javax.annotation.PostConstruct;
import javax.faces.bean.CustomScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ComponentExample(
        parent = PanelBean.BEAN_NAME,
        title = "example.ace.panel.menu.title",
        description = "example.ace.panel.menu.description",
        example = "/resources/examples/ace/panel/panelMenu.xhtml"
)
@ExampleResources(
        resources ={
            // xhtml
            @ExampleResource(type = ResourceType.xhtml,
                    title="panelMenu.xhtml",
                    resource = "/resources/examples/ace/panel/panelMenu.xhtml"),
            // Java Source
            @ExampleResource(type = ResourceType.java,
                    title="PanelMenu.java",
                    resource = "/WEB-INF/classes/org/icefaces/samples/showcase"+
                    "/example/ace/panel/PanelMenu.java")
        }
)
@ManagedBean(name= PanelMenu.BEAN_NAME)
@CustomScoped(value = "#{window}")
public class PanelMenu extends ComponentExampleImpl<PanelMenu> implements Serializable {

    public static final String BEAN_NAME = "panelMenu";

    public PanelMenu() {
        super(PanelMenu.class);
    }

    @PostConstruct
    public void initMetaData() {
        super.initMetaData();
    }
}