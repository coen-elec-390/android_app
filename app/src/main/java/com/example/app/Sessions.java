package com.example.app;

/*
 * Class for sessions
 */

public class Sessions {
    private long session_id;
    private String session_name;
    private String users;
    private String warnings;

    public Sessions(long session_id, String session_name, String users, String warnings) {
        this.session_id = session_id;
        this.session_name = session_name;
        this.users = users;
        this.warnings = warnings;
    }

    public long getSession_id() {
        return session_id;
    }

    public String getSession_name() {
        return session_name;
    }

    public String getUsers() {
        return users;
    }

    public String getWarnings() {
        return warnings;
    }
}
