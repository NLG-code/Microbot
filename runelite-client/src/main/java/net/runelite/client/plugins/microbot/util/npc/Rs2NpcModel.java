package net.runelite.client.plugins.microbot.util.npc;

import lombok.Getter;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.NpcOverrides;
import net.runelite.client.plugins.microbot.util.ActorModel;
import org.jetbrains.annotations.Nullable;

@Getter
public class Rs2NpcModel extends ActorModel implements NPC
{

	private final NPC runeliteNpc;

	public Rs2NpcModel(final NPC npc)
	{
		super(npc);
		this.runeliteNpc = npc;
	}

	@Override
	public int getId()
	{
		return runeliteNpc.getId();
	}

	@Override
	public int getIndex()
	{
		return runeliteNpc.getIndex();
	}

	@Override
	public NPCComposition getComposition()
	{
		return runeliteNpc.getComposition();
	}

	@Override
	public @Nullable NPCComposition getTransformedComposition()
	{
		return runeliteNpc.getTransformedComposition();
	}

	@Override
	public @Nullable NpcOverrides getModelOverrides()
	{
		return runeliteNpc.getModelOverrides();
	}

	@Override
	public @Nullable NpcOverrides getChatheadOverrides()
	{
		return runeliteNpc.getChatheadOverrides();
	}

	@Override
	public int @Nullable [] getOverheadArchiveIds()
	{
		return runeliteNpc.getOverheadArchiveIds();
	}

	@Override
	public short @Nullable [] getOverheadSpriteIds()
	{
		return runeliteNpc.getOverheadSpriteIds();
	}
}
