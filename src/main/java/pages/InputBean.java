package pages;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class InputBean {
    private String inputTextValue;
    private String inputTextAreaValue;
    private String inputSecret;
    private String inputHidden = "default inputHidden value";

    public void submit() {
        System.out.println("get inputTextValue: " + inputTextValue );
        System.out.println("get inputTextAreaValue: " + inputTextAreaValue);
        System.out.println("get inputSecret: " + inputSecret);
        System.out.println("get inputHidden: " + inputHidden);
    }

    public String getInputTextValue() {
        return inputTextValue;
    }

    public void setInputTextValue(String inputTextValue) {
        this.inputTextValue = inputTextValue;
    }

    public String getInputTextAreaValue() {
        return inputTextAreaValue;
    }

    public void setInputTextAreaValue(String inputTextAreaValue) {
        this.inputTextAreaValue = inputTextAreaValue;
    }

    public String getInputSecret() {
        return inputSecret;
    }

    public void setInputSecret(String inputSecret) {
        this.inputSecret = inputSecret;
    }

    public String getInputHidden() {
        return inputHidden;
    }

    public void setInputHidden(String inputHidden) {
        this.inputHidden = inputHidden;
    }
}
