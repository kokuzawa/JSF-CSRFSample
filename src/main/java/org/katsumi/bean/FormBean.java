package org.katsumi.bean;

import lombok.Setter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author Katsumi
 * @since 2014/10/07
 */
@Named
@RequestScoped
public class FormBean
{
    @Setter
    private String text;

    public String getText()
    {
        return String.format("登録しました「%s」", text);
    }
}
