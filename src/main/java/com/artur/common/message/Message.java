package com.artur.common.message;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public abstract class Message {
    protected Type type;
    protected Source source;

    public String getCode(){
        return source.name() + "_" + type.name();
    }
}
