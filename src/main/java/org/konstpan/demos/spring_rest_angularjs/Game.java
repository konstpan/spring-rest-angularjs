package org.konstpan.demos.spring_rest_angularjs;

/**
 *
 * @author Panos
 */
public class Game {
  Integer id;
  String name;
  String snippet;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSnippet() {
    return snippet;
  }

  public void setSnippet(String snippet) {
    this.snippet = snippet;
  }
  
}