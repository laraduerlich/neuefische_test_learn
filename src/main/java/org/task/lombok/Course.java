package org.task.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@AllArgsConstructor
@Builder
@Value // wird verwendet, um eine Klasse als immutable zu deklarieren.
public class Course {
    int id;
    String name;
    Teacher teacher;
    Student student;
}
