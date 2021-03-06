/*
 * Сервис проверки статуса банкоматов
 * Сервис, возвращающий информацию о банкоматах Альфа-Банка
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: apisupport@alfabank.ru
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lampa.alfabattle.first.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * SupportInfo
 */
@JsonPropertyOrder({
        SupportInfo.JSON_PROPERTY_EMAIL,
        SupportInfo.JSON_PROPERTY_OTHER,
        SupportInfo.JSON_PROPERTY_PHONE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-06-27T10:26:33.214272+03:00[Europe/Moscow]")
public class SupportInfo {
    public static final String JSON_PROPERTY_EMAIL = "email";
    private String email;

    public static final String JSON_PROPERTY_OTHER = "other";
    private String other;

    public static final String JSON_PROPERTY_PHONE = "phone";
    private String phone;


    public SupportInfo email(String email) {

        this.email = email;
        return this;
    }

    /**
     * Адрес электронной почты
     *
     * @return email
     **/

    @ApiModelProperty(value = "Адрес электронной почты")
    @JsonProperty(JSON_PROPERTY_EMAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public SupportInfo other(String other) {

        this.other = other;
        return this;
    }

    /**
     * Иные контакты поддержки
     *
     * @return other
     **/

    @ApiModelProperty(value = "Иные контакты поддержки")
    @JsonProperty(JSON_PROPERTY_OTHER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getOther() {
        return other;
    }


    public void setOther(String other) {
        this.other = other;
    }


    public SupportInfo phone(String phone) {

        this.phone = phone;
        return this;
    }

    /**
     * Телефон
     *
     * @return phone
     **/

    @ApiModelProperty(value = "Телефон")
    @JsonProperty(JSON_PROPERTY_PHONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SupportInfo supportInfo = (SupportInfo) o;
        return Objects.equals(this.email, supportInfo.email) &&
                Objects.equals(this.other, supportInfo.other) &&
                Objects.equals(this.phone, supportInfo.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, other, phone);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupportInfo {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    other: ").append(toIndentedString(other)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

