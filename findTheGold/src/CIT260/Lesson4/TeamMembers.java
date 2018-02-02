/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Lesson4;

/**
 *
 * @author pewst
 */
public class TeamMembers {
    
    // enum attributes
    private String name;
    
    // constructors

    private TeamMembers(String name) {
        this.name = name;
    }
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
