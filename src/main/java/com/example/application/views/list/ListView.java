package com.example.application.views.list;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.*;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;

@PageTitle("list")
@Route(value = "")
public class ListView extends VerticalLayout {

    public ListView() {
        Button button = new Button("Click Me!!!");
        TextField name = new TextField("Name");



        HorizontalLayout hl =  new HorizontalLayout(name,button);
        hl.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
    
        add(hl);

    }

}
