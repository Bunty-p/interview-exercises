package org.vm.app;

/**
 * Created with IntelliJ IDEA.
 * User: ssykes
 * Update
 * Date: 11/12/12
 * Time: 9:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class BeanOne {

  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
  public int incId() {
    id++;
  }

  //master change after squashing new-branch-3
}
