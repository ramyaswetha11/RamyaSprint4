package controller;

import java.awt.Graphics2D;

import controller.commands.CreateShapeCommand;

public interface IDrawShape {

	public void draw(CreateShapeCommand shape, Graphics2D graphics2d);

}

