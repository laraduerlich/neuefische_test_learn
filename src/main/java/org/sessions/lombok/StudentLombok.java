package org.sessions.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor // Konstruktor ohne Datenfeld
@Builder //
public class StudentLombok {

    private String name;
    private int age;
    private int id;
}
