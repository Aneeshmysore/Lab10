/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {
    /**
     * name - name of employee.
     *  */
    private String name;
    /**
     * manager -  manager.
     *  */
    private String manager;

    /**
     * Constructor for initialization.
     * @param newName - name.
     * @param newManager - manager.
     */
    public Employee(final String newName, final String newManager) {
        this.name = newName;
        this.manager = newManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param newName - name of employee.
     */
    public void setName(final String newName) {
        this.name = newName;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param newManager - manager.
     */
    public void setManager(final String newManager) {
        this.manager = newManager;
    }
}
