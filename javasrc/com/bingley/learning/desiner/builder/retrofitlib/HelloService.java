package com.bingley.learning.desiner.builder.retrofitlib;

import java.util.List;

public interface HelloService {

    //
    Call<List<String>> listRepos(String user);
}
