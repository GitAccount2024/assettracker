package com.example;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class HelloView extends VerticalLayout {

    public HelloView() {
        add(new H1("Hallo, AssetTracker!"));
    }
}