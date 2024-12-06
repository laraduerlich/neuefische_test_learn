package org.sessions.lombok;

import lombok.With;

@With
public record StudentRecord(String name,
                            int age,
                            int id) {
}
