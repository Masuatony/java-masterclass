package org.java.springsecurity.masterclas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams {
    List<String> names = Arrays.asList("John","Kelvin","Jane","Doe","Anto");

    List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("J"))
            .collect(Collectors.toList());


}
