package org.java.springsecurity.Interfaces.Animal.Building;
enum Geometry {LINE,POINT,POLYGON};
enum Color {CIRCLE,RED,GREEN,YELLOW, BLUE,ORANGE,BLACK};
enum lineMakers {DASHED,DOTTED,SOLID};
enum PointMarker {CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}

public interface Mappable {
    String JSON_PROPERTY = """
            "properties": {%s}\s""";

    String getLabel();

    Geometry getShape();

    String getMarker();
    default String toJSON() {

        return """
                "type": "%s", "label": "%s", "marker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }
    static void mapIt(Mappable mappable) {
     System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }

}


