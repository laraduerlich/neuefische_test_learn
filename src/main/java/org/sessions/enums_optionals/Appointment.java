package org.sessions.enums_optionals;

import java.util.List;

public record Appointment(Weekdays Weekday, List<String> Participants) {
}
