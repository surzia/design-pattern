package com.github.surzia.filter.codec;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
