package com.cowerling.domain;

import org.apache.ibatis.type.Alias;

/**
 * Created by dell on 2017-6-23.
 */
@Alias("gender")
public enum Gender {
    FEMAIL, MALE
}
