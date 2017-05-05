package com.example.vaadindemo;

import com.example.vaadindemo.domain.Lek;
import com.vaadin.annotations.Title;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.server.VaadinRequest;

import com.vaadin.ui.FormLayout;

import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


@Title("Vaadin Demo App")
public class VaadinApp extends UI {

	private static final long serialVersionUID = 1L;

			
	@Override
	protected void init(VaadinRequest request) {
		
				Lek lek = new Lek("", 0.0, "","","","","","");
				BeanItem<Lek> personItem = new BeanItem<Lek>(lek);	
				final FormLayout form = new FormLayout();
				final FieldGroup binder = new FieldGroup(personItem);
				binder.setItemDataSource(personItem);
				
			form.addComponent(binder.buildAndBind("Nazwa", "nazwa"));
			form.addComponent(binder.buildAndBind("Cena", "cena"));
			form.addComponent(binder.buildAndBind("Producent", "producent"));
			form.addComponent(binder.buildAndBind("Skład","sklad"));
			form.addComponent(binder.buildAndBind("Przeciwwskazania","przeciwwskazania"));
			form.addComponent(binder.buildAndBind("Ostrzeżenia","ostrzeżenia"));
			form.addComponent(binder.buildAndBind("Interakcje","interakcje"));
			form.addComponent(binder.buildAndBind("Działania niepożądane","działania_niepożądane"));
			
			binder.setBuffered(true);

			binder.getField("nazwa").setRequired(true);
			binder.getField("producent").setRequired(true);
			binder.getField("cena").setRequired(true);
			binder.getField("sklad").setRequired(true);
			binder.getField("przeciwwskazania").setRequired(true);
			binder.getField("ostrzeżenia").setRequired(true);
			binder.getField("interakcje").setRequired(true);
			binder.getField("działania_niepożądane").setRequired(true);
			
			VerticalLayout fvl = new VerticalLayout();
			fvl.setMargin(true);
			fvl.addComponent(form);
			setContent(fvl);
			}
}
