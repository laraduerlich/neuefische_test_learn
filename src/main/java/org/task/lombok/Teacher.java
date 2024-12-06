package org.task.lombok;

import lombok.Data;
import lombok.With;

@With
public record Teacher(int id, String name, String subject) {
}
