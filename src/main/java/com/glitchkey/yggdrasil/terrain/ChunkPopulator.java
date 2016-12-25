/*
 * Copyright (c) 2016 Sean Porter <glitchkey@gmail.com>
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.glitchkey.yggdrasil.terrain;

//* IMPORTS: JDK/JRE
	//* NOT NEEDED
//* IMPORTS: SPONGE
import org.spongepowered.api.world.extent.ImmutableBiomeVolume;
import org.spongepowered.api.world.extent.MutableBlockVolume;
import org.spongepowered.api.world.gen.GenerationPopulator;
import org.spongepowered.api.world.World;
//* IMPORTS: YGGDRASIL
import com.glitchkey.yggdrasil.noise.Perlin;
import com.glitchkey.yggdrasil.noise.RidgedMultifractal;
//* IMPORTS: OTHER
	//* NOT NEEDED

public class ChunkPopulator implements GenerationPopulator {
	private UnsupportedOperationException exception;
	private Perlin p;
	private RidgedMultifractal r;
	public void populate(World world, MutableBlockVolume blocks, 
		ImmutableBiomeVolume biomes)
	{
		if (exception != null) throw exception;

		String msg = "Custom generator is missing required method: ";
		msg += "populate()";
		exception = new UnsupportedOperationException(msg);

		throw exception;
	}

	public final double perlin(long seed, double x)
	{
		return p.noise(seed, x, 0, 0, 6, 1D, 2D);
	}

	public final double perlin(long seed, double x, double y)
	{
		return p.noise(seed, x, y, 0, 6, 1D, 2D);
	}

	public final double perlin(long seed, double x, double y, double z)
	{
		return p.noise(seed, x, y, z, 6, 1D, 2D);
	}

	public final double perlin(long seed, double x, int octaves,
		double frequency, double amplitude)
	{
		return p.noise(seed, x, 0, 0, octaves, frequency, amplitude);
	}

	public final double perlin(long seed, double x, double y, int octaves,
		double frequency, double amplitude)
	{
		return p.noise(seed, x, y, 0, octaves, frequency, amplitude);
	}

	public final double perlin(long seed, double x, double y, double z,
		int octaves, double frequency, double amplitude)
	{
		return p.noise(seed, x, y, z, octaves, frequency, amplitude);
	}

	public final double ridgedMultifractal(long seed, double x)
	{
		return r.noise(seed, x, 0, 0, 6, 1D, 2D);
	}

	public final double ridgedMultifractal(long seed, double x, double y)
	{
		return r.noise(seed, x, y, 0, 6, 1D, 2D);
	}

	public final double ridgedMultifractal(long seed, double x, double y,
		double z)
	{
		return r.noise(seed, x, y, z, 6, 1D, 2D);
	}

	public final double ridgedMultifractal(long seed, double x, int octaves,
		double frequency, double amplitude)
	{
		return r.noise(seed, x, 0, 0, octaves, frequency, amplitude);
	}

	public final double ridgedMultifractal(long seed, double x, double y,
		int octaves, double frequency, double amplitude)
	{
		return r.noise(seed, x, y, 0, octaves, frequency, amplitude);
	}

	public final double ridgedMultifractal(long seed, double x, double y,
		double z, int octaves, double frequency, double amplitude)
	{
		return r.noise(seed, x, y, z, octaves, frequency, amplitude);
	}
}
