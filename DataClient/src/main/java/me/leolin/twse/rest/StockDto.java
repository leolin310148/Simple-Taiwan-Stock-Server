package me.leolin.twse.rest;

/**
 * @author leolin
 */
public class StockDto {
    private String id;
    private String name;

    public StockDto() {
    }

    public StockDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
