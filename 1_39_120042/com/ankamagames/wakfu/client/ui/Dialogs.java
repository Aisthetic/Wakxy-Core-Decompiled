package com.ankamagames.wakfu.client.ui;

import java.util.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.wakfu.client.core.*;
import com.ankamagames.framework.fileFormat.io.*;
import com.ankamagames.framework.java.util.*;
import com.ankamagames.wakfu.client.ui.dialog.*;

public class Dialogs
{
    public static final HashMap<String, Class<? extends BasicElementFactory>> FACTORIES;
    public static final String GRAPHICAL_DIAGNOSTICS_DIALOG = "graphicalDiagnosticsDialog";
    public static final String MESSAGE_BOX_ID = "messageBoxDialog";
    public static final String DEATH_MESSAGE_BOX_DIALOG_ID = "deathMessageBoxDialog";
    public static final String REPORT_BUG_DIALOG_ID = "reportBugDialog";
    public static final String POPUP_ID = "popupDialog";
    public static final String MRU_ID = "mruDialog";
    public static final String OVERHEAD_ID = "overheadDialog";
    public static final String OVERHEAD_PLAYER_ID = "overheadPlayerDialog";
    public static final String INTERACTIVE_BUBBLE_DIALOG_ID = "interactiveBubbleDialog";
    public static final String INTERACTIVE_BUBBLE_DIALOG_2_ID = "interactiveBubbleDialog2";
    public static final String SPLASH_SCREEN_DIALOG_ID = "splashScreenDialog";
    public static final String BUBBLE_DIALOG = "bubbleDialog";
    public static final String PET_BUBBLE_DIALOG = "petBubbleDialog";
    public static final String EMOTE_ICON_DIALOG = "emoteIconDialog";
    public static final String DUNGEON_DIALOG_ID = "dungeonDialog";
    public static final String PLAYER_GIFT_DIALOG_ID = "playerGiftDialog";
    public static final String PROGRESS_DIALOG_ID = "progressDialog";
    public static final String SYSTEM_MESSAGE_DIALOG_ID = "messageContainer";
    public static final String SYSTEM_MESSAGE_DIALOG2_ID = "messageContainer2";
    public static final String SYSTEM_MESSAGE_DIALOG3_ID = "messageContainer3";
    public static final String SYSTEM_MESSAGE_CHALLENGE_DIALOG_ID = "messageContainerChallenge";
    public static final String SYSTEM_MESSAGE_DIALOG_FIGHT_ID = "messageContainerFight";
    public static final String ADMIN_MESSAGE_DIALOG_ID = "adminMessageContainer";
    public static final String NOTIFICATION_MESSAGE_DIALOG_ID = "notificationMessageContainer";
    public static final String FIGHT_MESSAGE_DIALOG_ID = "fightMessageContainer";
    public static final String CONSOLE_DIALOG_ID = "consoleDialog";
    public static final String OPTIONS_DIALOG_ID = "optionsDialog";
    public static final String CHAT_OPTIONS_DIALOG_ID = "chatOptionsDialog";
    public static final String LOGON_DIALOG_ID = "logonDialog";
    public static final String NICKNAME_CHOICE_DIALOG_ID = "nicknameChoiceDialog";
    public static final String MAP_DIALOG_ID = "mapDialog";
    public static final String DRAGO_MAP_DIALOG_ID = "dragoMapDialog";
    public static final String MAP_EDITABLE_POPUP_DIALOG_ID = "mapEditablePopup";
    public static final String MAP_EDITABLE_POPUP_DIALOG2_ID = "mapEditablePopup2";
    public static final String COMPLETE_MAP_POPUP_DIALOG_ID = "completeMapPopup";
    public static final String MINIMAP_POPUP_DIALOG_ID = "minimapPopup";
    public static final String DRAGO_MAP_POPUP_DIALOG_ID = "dragoMapPopup";
    public static final String MINIMAP_DIALOG_ID = "minimapDialog";
    public static final String SYSTEM_BAR_DIALOG_ID = "systemBarDialog";
    public static final String MENU_BAR_DIALOG_ID = "menuBarDialog";
    public static final String MENU_DIALOG_ID = "menuDialog";
    public static final String WEATHER_INFO_DIALOG_ID = "weatherInfoDialog";
    public static final String SESSION_TIMER_DIALOG_ID = "sessionTimerDialog";
    public static final String WEB_SHOP_DIALOG_ID = "webShopDialog";
    public static final String WEB_SHOP_ARTICLE_DIALOG_ID = "webShopArticleDialog";
    public static final String SERVER_CHOICE_DIALOG_ID = "serverChoiceDialog";
    public static final String CHARACTER_CHOICE_DIALOG_ID = "characterChoiceDialog";
    public static final String CHARACTER_CREATION_DIALOG_ID = "characterCreationDialog";
    public static final String CHARACTER_CREATION_SOUL_DIALOG_ID = "characterCreationSoulDialog";
    public static final String INFORMATION_MESSAGE_DIALOG_ID = "informationMessageDialog";
    public static final String RUNNING_EFFECT_DETAIL_DIALOG_ID = "runningEffectDetailDialog";
    public static final String EQUIPMENT_DIALOG_ID = "equipmentDialog";
    public static final String ITEM_DETAIL_DIALOG_ID = "itemDetailDialog";
    public static final String CRAFT_ITEM_DETAIL_DIALOG_ID = "craftItemDetailDialog";
    public static final String SPELL_DESCRIPTION_DIALOG_ID = "spellDescriptionDialog";
    public static final String STATE_BAR_DIALOG_ID = "stateBarDialog";
    public static final String STATE_DETAIL_DIALOG_ID = "stateDetailDialog";
    public static final String EFFECT_AREA_DETAIL_DIALOG_ID = "effectAreaDetailDialog";
    public static final String SET_DETAIL_DIALOG_ID = "setDetailDialog";
    public static final String EXCHANGE_DIALOG_ID = "exchangeDialog";
    public static final String MODERATOR_CHAT_DIALOG_ID = "moderatorChatDialog";
    public static final String DIMENSIONAL_BAG_FLEA_HISTORY_DIALOG_ID = "dimensionalBagFleaHistoryDialog";
    public static final String DIMENSIONAL_BAG_ROOM_ADMINISTRATION_DIALOG_ID = "dimensionalBagRoomAdministrationDialog";
    public static final String DIMENSIONAL_BAG_ROOM_INDIVIDUAL_RIGHTS_DIALOG_ID = "dimensionalBagRoomIndividualRightsDialog";
    public static final String DIMENSIONAL_BAG_ROOM_MANAGER_DIALOG_ID = "dimensionalBagRoomManagerDialog";
    public static final String DIMENSIONAL_BAG_APPEARANCE_MANAGER_DIALOG_ID = "dimensionalBagAppearanceManagerDialog";
    public static final String DIMENSIONAL_BAG_FLEA_DIALOG_ID = "dimensionalBagFleaDialog";
    public static final String DIMENSIONAL_BAG_FLEA_LIST_DIALOG_ID = "dimensionalBagFleaListDialog";
    public static final String SET_PRICE_DIALOG_ID = "setPriceDialog";
    public static final String FLEA_DIALOG_ID = "fleaDialog";
    public static final String CONFIRM_FLEA_PURCHASE_DIALOG_ID = "confirmFleaPurchaseDialog";
    public static final String CONFIRM_MARKET_PURCHASE_DIALOG_ID = "confirmMarketPurchaseDialog";
    public static final String SPLIT_STACK_DIALOG_ID = "splitStackDialog";
    public static final String SPLIT_EXCHANGE_AMOUNT_OF_CASH_DIALOG_ID = "splitExchangeAmountOfCashDialog";
    public static final String TEMPORARY_TRANSFER_INVENTORY_DIALOG_ID = "temporaryTransferInventoryDialog";
    public static final String CHAT_DIALOG_ID = "chatDialog";
    public static final String CONTACT_LIST_DIALOG_ID = "contactListDialog";
    public static final String PARTY_LIST_DIALOG_ID = "partyListDialog";
    public static final String PARTY_LIST_INVITE_DIALOG_ID = "partyListInviteDialog";
    public static final String TIMELINE_CELL_DIALOG_ID = "timelineCellDialog";
    public static final String TIMELINE_CELL_DIALOG_2_ID = "timelineCellDialog2";
    public static final String TIMELINE_DIALOG_ID = "timePointBarDialog";
    public static final String TIME_POINT_BONUS_SELECTION_DIALOG_ID = "timePointBonusSelectionDialog";
    public static final String FIGHT_RESULT_DIALOG_ID = "fightResultDialog";
    public static final String PVP_FIGHT_RESULT_DIALOG_ID = "pvpFightResultDialog";
    public static final String FIGHT_RESULT_SPELLS_DETAILS_DIALOG_ID = "fightResultSpellsDetailsDialog";
    public static final String FIGHT_RESULT_SUMMONS_DETAILS_DIALOG_ID = "fightResultSummonsDetailsDialog";
    public static final String FIGHT_TIMER_DIALOG_ID = "fightTimerDialog";
    public static final String SPELLS_PAGE_DIALOG_ID = "spellsDialog";
    public static final String SPELLS_RESTAT_DIALOG_ID = "spellsRestatDialog";
    public static final String CRAFT_DIALOG_ID = "craftDialog";
    public static final String CRAFT_TABLE_DIALOG_ID = "craftTableDialog";
    public static final String CRAFT_TABLE_FREE_DIALOG_ID = "craftTableFreeDialog";
    public static final String CRAFT_LINKED_RECIPE_DIALOG_ID = "craftLinkedRecipeDialog";
    public static final String NEW_CRAFT_DIALOG_ID = "newCraftDialog";
    public static final String EMISSARY_TUTO_DIALOG_ID = "emissaryTutoDialog";
    public static final String COLLECTING_PROGRESS_ID = "collectingProgressDialog";
    public static final String CLIMATE_BONUS_DETAIL_DIALOG_ID = "climateBonusDetailDialog";
    public static final String CHALLENGE_RESULT_DIALOG_ID = "challengeResultDialog";
    public static final String CHALLENGE_INPUT_DIALOG_ID = "challengeInputDialog";
    public static final String PROTECTOR_MANAGEMENT_DIALOG_ID = "protectorManagementDialog";
    public static final String PROTECTOR_BUDGET_ALLOCATE_DIALOG_ID = "protectorBudgetAllocateDialog";
    public static final String PROTECTOR_BUDGET_TRANSFER_DIALOG_ID = "protectorBudgetTransferDialog";
    public static final String PROTECTOR_VIEW_DIALOG_ID = "protectorViewDialog";
    public static final String OSAMODAS_SYMBIOT_DIALOG_ID = "osamodasSymbiotDialog";
    public static final String MONSTER_DETAIL_DIALOG_ID = "monsterDetailDialog";
    public static final String RECYCLE_DIALOG_ID = "recycleDialog";
    public static final String IMPROVE_GEM_DIALOG_ID = "improveGemDialog";
    public static final String MERGE_GEM_DIALOG_ID = "mergeGemDialog";
    public static final String MERGE_POWDER_DIALOG_ID = "mergePowderDialog";
    public static final String CHARACTER_SHEET_DIALOG_ID = "characterSheetDialog";
    public static final String CHARACTER_SHEET_APTITUDES_DIALOG_ID = "characterSheetAptitudesDialog";
    public static final String ADMIN_MONITOR_DIALOG_ID = "adminMonitorDialog";
    public static final String ADMIN_CHARACTER_EDITOR_DIALOG_ID = "adminCharacterEditorDialog";
    public static final String ADMIN_CHARACTER_COLOR_EDITOR_DIALOG_ID = "adminCharacterColorEditorDialog";
    public static final String ZAAP_DIALOG_ID = "zaapDialog";
    public static final String GUILD_CREATOR_DIALOG_ID = "guildCreatorDialog";
    public static final String GUILD_MANAGEMENT_DIALOG_ID = "guildManagementDialog";
    public static final String GUILD_LADDER_DIALOG_ID = "guildLadderDialog";
    public static final String GUILD_TEXT_EDITOR_DIALOG_ID = "guildTextEditorDialog";
    public static final String WORLD_AND_FIGHT_BAR_DIALOG_ID = "worldAndFightBarDialog";
    public static final String VERTICAL_STATE_BAR_DIALOG_ID = "verticalStateBarDialog";
    public static final String SECONDARY_SHORTCUT_BAR_DIALOG_ID = "secondaryShortcutBarDialog";
    public static final String VERTICAL_SECONDARY_SHORTCUT_BAR_DIALOG_ID = "verticalSecondaryShortcutBarDialog";
    public static final String VOTE_INFORMATION_DIALOG_ID = "voteInformationDialog";
    public static final String EVENTS_CALENDAR_DIALOG_ID = "eventsCalendarDialog";
    public static final String EVENTS_CALENDAR_CREATE_DIALOG_ID = "eventsCalendarCreateDialog";
    public static final String EVENTS_CALENDAR_EDIT_DIALOG_ID = "eventsCalendarEditDialog";
    public static final String CALENDAR_DIALOG_ID = "calendarDialog";
    public static final String MARKET_DIALOG_ID = "marketDialog";
    public static final String DIMENSIONAL_BAG_FLEA_REGISTER_DIALOG_ID = "dimensionalBagFleaRegisterDialog";
    public static final String NEED_GREED_LOOT_DIALOG_ID = "needGreedLootDialog";
    public static final String FRESCO_DIALOG_ID = "frescoDialog";
    public static final String ECOSYSTEM_EQUILIBRIUM_DIALOG_ID = "ecosystemEquilibriumDialog";
    public static final String WEATHER_INFO_SMALL_DIALOG_ID = "weatherInfoSmallDialog";
    public static final String QUEST_DIALOG_ID = "questDialog";
    public static final String FIGHTER_DESCRIPTION_DIALOG_ID = "fighterDescriptionDialog";
    public static final String EMOTES_INVENTORY_DIALOG_ID = "emotesInventoryDialog";
    public static final String PET_DIALOG_ID = "petDialog";
    public static final String PET_COLOR_PREVIEW_DIALOG_ID = "petColorPreviewDialog";
    public static final String DEBUG_ANM_DIALOG_ID = "debugAnmDialog";
    public static final String MIX_DEBUGGER_DIALOG_ID = "mixDebuggerDialog";
    public static final String ACHIEVEMENTS_DIALOG_ID = "achievementsDialog";
    public static final String ACHIEVEMENT_UNLOCKED_DIALOG_ID = "achievementUnlockedDialog";
    public static final String FOLLOWED_ACHIEVEMENTS_DIALOG_ID = "followedAchievementsDialog";
    public static final String VERTICAL_FOLLOWED_ACHIEVEMENTS_DIALOG_ID = "verticalFollowedAchievementsDialog";
    public static final String BACKGROUND_DISPLAY_DIALOG_ID = "backgroundDisplayDialog";
    public static final String DUNGEON_LADDER_DIALOG_ID = "dungeonLadderDialog";
    public static final String DUNGEON_STATUT_DIALOG_ID = "dungeonStatutDialog";
    public static final String ARCADE_DUNGEON_DIALOG_ID = "arcadeDungeonDialog";
    public static final String ARCADE_DUNGEON_RESULT_DIALOG_ID = "arcadeDungeonResultDialog";
    public static final String ARCADE_DUNGEON_TEASER_DIALOG_ID = "arcadeDungeonTeaserDialog";
    public static final String SPLASH_MESSAGE_DIALOG_ID = "splashMessageDialog";
    public static final String ANIMATED_SMILEY_DIALOG_ID = "animatedSmileyDialog";
    public static final String SUNDIAL_DIALOG_ID = "sundialDialog";
    public static final String INTERACTIVE_DIALOG_DIALOG_ID = "interactiveDialogDialog";
    public static final String PASSPORT_DIALOG_ID = "passportDialog";
    public static final String CHEST_LOOT_DIALOG_ID = "chestLootDialog";
    public static final String VIDEO_DIALOG_ID = "videoDialog";
    public static final String VIDEO_LOADING_DIALOG_ID = "videoLoadingDialog";
    public static final String VIDEO_CINEMATIC_DIALOG_ID = "videoCinematicDialog";
    public static final String MERCHANT_TAX_DIALOG_ID = "merchantTaxDialog";
    public static final String FREE_COLLECT_MACHINE_DIALOG_ID = "freeCollectMachineDialog";
    public static final String LOCKED_COLLECT_MACHINE_DIALOG_ID = "lockedCollectMachineDialog";
    public static final String JAIL_INFO_DIALOG_ID = "jailInfoDialog";
    public static final String NATION_DIALOG_ID = "nationDialog";
    public static final String GOVERNMENT_MEMBER_DIALOG_ID = "governmentMemberDetailsDialog";
    public static final String SHUKRUTE_REWARD_DIALOG_ID = "shukruteRewardDialog";
    public static final String INFO_DIALOG_ID = "infoDialog";
    public static final String STORAGE_BOX_DIALOG_ID = "storageBoxDialog";
    public static final String SLOT_MACHINE_DIALOG_ID = "slotMachineDialog";
    public static final String VAULT_DIALOG_ID = "vaultDialog";
    public static final String EXCHANGE_MACHINE_DIALOG_ID = "exchangeMachineDialog";
    public static final String BOOKCASE_DIALOG_ID = "bookcaseDialog";
    public static final String EQUIPABLE_DUMMY_DIALOG_ID = "equipableDummyDialog";
    public static final String STUFF_PREVIEW_DIALOG_ID = "stuffPreviewDialog";
    public static final String GEM_ITEMS_DIALOG_ID = "gemItemDialog";
    public static final String GAZETTE_DIALOG_ID = "gazetteDialog";
    public static final String QUEST_ACTIVATION_DIALOG_ID = "questActivationDialog";
    public static final String QUEST_ACTIVATED_DIALOG_ID = "questActivatedDialog";
    public static final String QUEST_DESCRIPTION_DIALOG_ID = "questDescriptionDialog";
    public static final String QUEST_LIST_BAR_DIALOG_ID = "questListBarDialog";
    public static final String WORLD_EDITOR_DIALOG_ID = "worldEditorDialog";
    public static final String BUILDING_EVOLUTION_DIALOG_ID = "buildingEvolutionDialog";
    public static final String HAVEN_WORLD_BUILDING_PANEL_DIALOG_ID = "havenWorldBuildingPanelDialog";
    public static final String HAVEN_WORLD_PANEL_DIALOG_ID = "havenWorldPanelDialog";
    public static final String HAVEN_WORLD_BID_DIALOG_ID = "havenWorldBidDialog";
    public static final String HAVEN_WORLD_RESOURCES_COLLECTOR_DIALOG_ID = "havenWorldResourcesCollectorDialog";
    public static final String ALMANACH_DIALOG_ID = "almanachDialog";
    public static final String TUTORIAL_BOOK_DIALOG_ID = "tutorialBookDialog";
    public static final String RENAME_CHARACTER_DIALOG_ID = "renameCharacterDialog";
    public static final String COMPANIONS_MANAGEMENT_DIALOG_ID = "companionsManagementDialog";
    public static final String KROSMOZ_COLLECTION_DIALOG_ID = "krosmozCollectionDialog";
    public static final String BLIND_BOX_DIALOG_ID = "blindBoxDialog";
    public static final String XP_GAIN_DIALOG_ID = "xpGainDialog";
    public static final String SEED_SPREADER_DIALOG_ID = "seedSpreaderDialog";
    public static final String TUTORIAL_MESSAGE_DIALOG_ID = "tutorialMessageDialog";
    public static final String NATION_SELECTION_PANEL_DIALOG_ID = "nationSelectionPanelDialog";
    public static final String COSMETICS_DIALOG_ID = "cosmeticsDialog";
    public static final String PET_COSMETICS_DIALOG_ID = "petCosmeticsDialog";
    public static final String MODERATION_PANEL_DIALOG_ID = "moderationPanelDialog";
    public static final String SUBSCRIPTION_ENDED_DIALOG_ID = "subscriptionEndedDialog";
    public static final String STEAM_LINK_ACCOUNT_DIALOG_ID = "steamLinkAccountDialog";
    public static final String SELECT_ITEM_ELEMENTS_DIALOG_ID = "selectItemElementsDialog";
    public static final String NATION_PVP_LADDER_DIALOG_ID = "nationPvpLadderDialog";
    public static final String PVP_LADDER_ENTRY_DIALOG_ID = "pvpLadderEntryDialog";
    public static final String APTITUDE_BONUS_DIALOG_ID = "aptitudeBonusDialog";
    public static final String DISPLAY_BUTTON_DIALOG_ID = "displayButtonDialog";
    public static final String PARTY_SEARCH_ID = "partySearchDialog";
    public static final String MERCENARY_DIALOG_ID = "mercenaryDialog";
    public static final String INVENTORY_ONLY_DIALOG_ID = "inventoryOnlyDialog";
    public static final int DEFAULT_MESSAGE_BOX_TYPE = 0;
    public static final int DEATH_MESSAGE_BOX_TYPE = 1;
    public static final short DEFAULT_MODAL_LEVEL = 10000;
    public static final short POPUP_MODAL_LEVEL = 30000;
    public static final short INTERACTIVE_BUBBLE_MODAL_LEVEL = 30000;
    public static final short SPLASH_SCREEN_DIALOG_MODAL_LEVEL = 15000;
    public static final short INTERACTIVE_DIALOG_DIALOG_MODAL_LEVEL = 18000;
    public static final short PROGRESS_DIALOG_MODAL_LEVEL = 19500;
    public static final short CONSOLE_DIALOG_MODAL_LEVEL = 30000;
    public static final short MENU_DIALOG_MODAL_LEVEL = 26000;
    public static final short SHORTCUT_BAR_DIALOG_MODAL_LEVEL = 10005;
    public static final short SPLIT_STACK_DIALOG_MODAL_LEVEL = 20000;
    public static final short NOTIFICATION_DIALOG_MODAL_LEVEL = 10004;
    public static final short WAKFU_BAR_DIALOG_MODAL_LEVEL = 10005;
    public static final short WORLD_BAR_DIALOG_MODAL_LEVEL = 10005;
    public static final short FIGHT_BAR_DIALOG_MODAL_LEVEL = 10005;
    public static final short WORLD_EDITOR_DIALOG_MODAL_LEVEL = 10005;
    
    public static String getDialogPath(final String dialogId) {
        final String dialog = getClassDialogName(dialogId);
        if (dialog == null) {
            return getDialogUrl(dialogId);
        }
        return dialog;
    }
    
    static String getClassDialogName(final String dialogId) {
        final Class c = Dialogs.FACTORIES.get(dialogId);
        if (c != null) {
            return c.getName();
        }
        return null;
    }
    
    static String getDialogUrl(final String dialogId) {
        final String url = ContentFileHelper.getPath(WakfuConfiguration.getInstance().getDialogsPath(), dialogId);
        if (!URLUtils.urlExists(url)) {
            return null;
        }
        return url;
    }
    
    static {
        (FACTORIES = new HashMap<String, Class<? extends BasicElementFactory>>()).put("achievementsDialog", AchievementsDialog.class);
        Dialogs.FACTORIES.put("achievementUnlockedDialog", AchievementUnlockedDialog.class);
        Dialogs.FACTORIES.put("adminCharacterColorEditorDialog", AdminCharacterColorEditorDialog.class);
        Dialogs.FACTORIES.put("adminCharacterEditorDialog", AdminCharacterEditorDialog.class);
        Dialogs.FACTORIES.put("adminMessageContainer", AdminMessageContainer.class);
        Dialogs.FACTORIES.put("adminMonitorDialog", AdminMonitorDialog.class);
        Dialogs.FACTORIES.put("almanachDialog", AlmanachDialog.class);
        Dialogs.FACTORIES.put("animatedSmileyDialog", AnimatedSmileyDialog.class);
        Dialogs.FACTORIES.put("aptitudeBonusDialog", AptitudeBonusDialog.class);
        Dialogs.FACTORIES.put("arcadeDungeonDialog", ArcadeDungeonDialog.class);
        Dialogs.FACTORIES.put("arcadeDungeonResultDialog", ArcadeDungeonResultDialog.class);
        Dialogs.FACTORIES.put("arcadeDungeonTeaserDialog", ArcadeDungeonTeaserDialog.class);
        Dialogs.FACTORIES.put("backgroundDisplayDialog", BackgroundDisplayDialog.class);
        Dialogs.FACTORIES.put("blindBoxDialog", BlindBoxDialog.class);
        Dialogs.FACTORIES.put("bookcaseDialog", BookcaseDialog.class);
        Dialogs.FACTORIES.put("bubbleDialog", BubbleDialog.class);
        Dialogs.FACTORIES.put("calendarDialog", CalendarDialog.class);
        Dialogs.FACTORIES.put("challengeResultDialog", ChallengeResultDialog.class);
        Dialogs.FACTORIES.put("challengeInputDialog", ChallengeInputDialog.class);
        Dialogs.FACTORIES.put("characterSheetDialog", CharacterSheetDialog.class);
        Dialogs.FACTORIES.put("characterSheetAptitudesDialog", CharacterSheetAptitudesDialog.class);
        Dialogs.FACTORIES.put("characterChoiceDialog", CharacterChoiceDialog.class);
        Dialogs.FACTORIES.put("characterCreationDialog", CharacterCreationDialog.class);
        Dialogs.FACTORIES.put("characterCreationSoulDialog", CharacterCreationSoulDialog.class);
        Dialogs.FACTORIES.put("chatDialog", ChatDialog.class);
        Dialogs.FACTORIES.put("chatOptionsDialog", ChatOptionsDialog.class);
        Dialogs.FACTORIES.put("chestLootDialog", ChestLootDialog.class);
        Dialogs.FACTORIES.put("climateBonusDetailDialog", ClimateBonusDetailDialog.class);
        Dialogs.FACTORIES.put("collectingProgressDialog", CollectingProgressDialog.class);
        Dialogs.FACTORIES.put("companionsManagementDialog", CompanionsManagementDialog.class);
        Dialogs.FACTORIES.put("completeMapPopup", CompleteMapPopup.class);
        Dialogs.FACTORIES.put("confirmFleaPurchaseDialog", ConfirmFleaPurchaseDialog.class);
        Dialogs.FACTORIES.put("confirmMarketPurchaseDialog", ConfirmMarketPurchaseDialog.class);
        Dialogs.FACTORIES.put("consoleDialog", ConsoleDialog.class);
        Dialogs.FACTORIES.put("contactListDialog", ContactListDialog.class);
        Dialogs.FACTORIES.put("cosmeticsDialog", CosmeticsDialog.class);
        Dialogs.FACTORIES.put("craftDialog", CraftDialog.class);
        Dialogs.FACTORIES.put("newCraftDialog", NewCraftDialog.class);
        Dialogs.FACTORIES.put("craftItemDetailDialog", CraftItemDetailDialog.class);
        Dialogs.FACTORIES.put("craftTableDialog", CraftTableDialog.class);
        Dialogs.FACTORIES.put("craftTableFreeDialog", CraftTableFreeDialog.class);
        Dialogs.FACTORIES.put("craftLinkedRecipeDialog", CraftLinkedRecipeDialog.class);
        Dialogs.FACTORIES.put("debugAnmDialog", DebugAnmDialog.class);
        Dialogs.FACTORIES.put("mixDebuggerDialog", MixDebuggerDialog.class);
        Dialogs.FACTORIES.put("deathMessageBoxDialog", DeathMessageBoxDialog.class);
        Dialogs.FACTORIES.put("dungeonDialog", DungeonDialog.class);
        Dialogs.FACTORIES.put("dimensionalBagAppearanceManagerDialog", DimensionalBagAppearanceManagerDialog.class);
        Dialogs.FACTORIES.put("dimensionalBagFleaHistoryDialog", DimensionalBagFleaHistoryDialog.class);
        Dialogs.FACTORIES.put("dimensionalBagFleaRegisterDialog", DimensionalBagFleaRegisterDialog.class);
        Dialogs.FACTORIES.put("dimensionalBagRoomAdministrationDialog", DimensionalBagRoomAdministrationDialog.class);
        Dialogs.FACTORIES.put("dimensionalBagRoomIndividualRightsDialog", DimensionalBagRoomIndividualRightsDialog.class);
        Dialogs.FACTORIES.put("dimensionalBagRoomManagerDialog", DimensionalBagRoomManagerDialog.class);
        Dialogs.FACTORIES.put("dimensionalBagFleaDialog", DimensionalBagFleaDialog.class);
        Dialogs.FACTORIES.put("dimensionalBagFleaListDialog", DimensionalBagFleaListDialog.class);
        Dialogs.FACTORIES.put("dragoMapDialog", DragoMapDialog.class);
        Dialogs.FACTORIES.put("dragoMapPopup", DragoMapPopup.class);
        Dialogs.FACTORIES.put("displayButtonDialog", DisplayButtonDialog.class);
        Dialogs.FACTORIES.put("dungeonLadderDialog", DungeonLadderDialog.class);
        Dialogs.FACTORIES.put("dungeonStatutDialog", DungeonStatutDialog.class);
        Dialogs.FACTORIES.put("ecosystemEquilibriumDialog", EcosystemEquilibriumDialog.class);
        Dialogs.FACTORIES.put("effectAreaDetailDialog", EffectAreaDetailDialog.class);
        Dialogs.FACTORIES.put("emissaryTutoDialog", EmissaryTutoDialog.class);
        Dialogs.FACTORIES.put("emoteIconDialog", EmoteIconDialog.class);
        Dialogs.FACTORIES.put("emotesInventoryDialog", EmotesInventoryDialog.class);
        Dialogs.FACTORIES.put("equipableDummyDialog", EquipableDummyDialog.class);
        Dialogs.FACTORIES.put("equipmentDialog", EquipmentDialog.class);
        Dialogs.FACTORIES.put("eventsCalendarDialog", EventsCalendarDialog.class);
        Dialogs.FACTORIES.put("eventsCalendarCreateDialog", EventsCalendarCreateDialog.class);
        Dialogs.FACTORIES.put("eventsCalendarEditDialog", EventsCalendarEditDialog.class);
        Dialogs.FACTORIES.put("exchangeMachineDialog", ExchangeMachineDialog.class);
        Dialogs.FACTORIES.put("exchangeDialog", ExchangeDialog.class);
        Dialogs.FACTORIES.put("fightMessageContainer", FightMessageContainer.class);
        Dialogs.FACTORIES.put("fightResultDialog", FightResultDialog.class);
        Dialogs.FACTORIES.put("fightResultSpellsDetailsDialog", FightResultSpellsDetailsDialog.class);
        Dialogs.FACTORIES.put("fightResultSummonsDetailsDialog", FightResultSummonsDetailsDialog.class);
        Dialogs.FACTORIES.put("fightTimerDialog", FightTimerDialog.class);
        Dialogs.FACTORIES.put("fighterDescriptionDialog", FighterDescriptionDialog.class);
        Dialogs.FACTORIES.put("fleaDialog", FleaDialog.class);
        Dialogs.FACTORIES.put("followedAchievementsDialog", FollowedAchievementsDialog.class);
        Dialogs.FACTORIES.put("frescoDialog", FrescoDialog.class);
        Dialogs.FACTORIES.put("freeCollectMachineDialog", FreeCollectMachineDialog.class);
        Dialogs.FACTORIES.put("gazetteDialog", GazetteDialog.class);
        Dialogs.FACTORIES.put("gemItemDialog", GemItemDialog.class);
        Dialogs.FACTORIES.put("governmentMemberDetailsDialog", GovernmentMemberDetailsDialog.class);
        Dialogs.FACTORIES.put("graphicalDiagnosticsDialog", GraphicalDiagnosticsDialog.class);
        Dialogs.FACTORIES.put("guildCreatorDialog", GuildCreatorDialog.class);
        Dialogs.FACTORIES.put("guildLadderDialog", GuildLadderDialog.class);
        Dialogs.FACTORIES.put("guildManagementDialog", GuildManagementDialog.class);
        Dialogs.FACTORIES.put("guildTextEditorDialog", GuildTextEditorDialog.class);
        Dialogs.FACTORIES.put("havenWorldPanelDialog", HavenWorldPanelDialog.class);
        Dialogs.FACTORIES.put("havenWorldBidDialog", HavenWorldBidDialog.class);
        Dialogs.FACTORIES.put("havenWorldBuildingPanelDialog", HavenWorldBuildingPanelDialog.class);
        Dialogs.FACTORIES.put("havenWorldResourcesCollectorDialog", HavenWorldResourcesCollectorDialog.class);
        Dialogs.FACTORIES.put("infoDialog", InfoDialog.class);
        Dialogs.FACTORIES.put("informationMessageDialog", InformationMessageDialog.class);
        Dialogs.FACTORIES.put("inventoryOnlyDialog", InventoryOnlyDialog.class);
        Dialogs.FACTORIES.put("interactiveBubbleDialog", InteractiveBubbleDialog.class);
        Dialogs.FACTORIES.put("interactiveBubbleDialog2", InteractiveBubbleDialog2.class);
        Dialogs.FACTORIES.put("interactiveDialogDialog", InteractiveDialogDialog.class);
        Dialogs.FACTORIES.put("itemDetailDialog", ItemDetailDialog.class);
        Dialogs.FACTORIES.put("jailInfoDialog", JailInfoDialog.class);
        Dialogs.FACTORIES.put("krosmozCollectionDialog", KrosmozCollectionDialog.class);
        Dialogs.FACTORIES.put("logonDialog", LogonDialog.class);
        Dialogs.FACTORIES.put("lockedCollectMachineDialog", LockedCollectMachineDialog.class);
        Dialogs.FACTORIES.put("mapDialog", MapDialog.class);
        Dialogs.FACTORIES.put("mapEditablePopup", MapEditablePopup.class);
        Dialogs.FACTORIES.put("mapEditablePopup2", MapEditablePopup2.class);
        Dialogs.FACTORIES.put("marketDialog", MarketDialog.class);
        Dialogs.FACTORIES.put("menuBarDialog", MenuBarDialog.class);
        Dialogs.FACTORIES.put("menuDialog", MenuDialog.class);
        Dialogs.FACTORIES.put("mercenaryDialog", MercenaryDialog.class);
        Dialogs.FACTORIES.put("merchantTaxDialog", MerchantTaxDialog.class);
        Dialogs.FACTORIES.put("mergeGemDialog", MergeGemDialog.class);
        Dialogs.FACTORIES.put("mergePowderDialog", MergePowderDialog.class);
        Dialogs.FACTORIES.put("messageBoxDialog", MessageBoxDialog.class);
        Dialogs.FACTORIES.put("minimapDialog", MinimapDialog.class);
        Dialogs.FACTORIES.put("minimapPopup", MinimapPopup.class);
        Dialogs.FACTORIES.put("monsterDetailDialog", MonsterDetailDialog.class);
        Dialogs.FACTORIES.put("moderatorChatDialog", ModeratorChatDialog.class);
        Dialogs.FACTORIES.put("moderationPanelDialog", ModerationPanelDialog.class);
        Dialogs.FACTORIES.put("mruDialog", MruDialog.class);
        Dialogs.FACTORIES.put("nationDialog", NationDialog.class);
        Dialogs.FACTORIES.put("nationPvpLadderDialog", NationPvpLadderDialog.class);
        Dialogs.FACTORIES.put("nationSelectionPanelDialog", NationSelectionPanelDialog.class);
        Dialogs.FACTORIES.put("needGreedLootDialog", NeedGreedLootDialog.class);
        Dialogs.FACTORIES.put("nicknameChoiceDialog", NicknameChoiceDialog.class);
        Dialogs.FACTORIES.put("notificationMessageContainer", NotificationMessageContainer.class);
        Dialogs.FACTORIES.put("optionsDialog", OptionsDialog.class);
        Dialogs.FACTORIES.put("overheadDialog", OverheadDialog.class);
        Dialogs.FACTORIES.put("overheadPlayerDialog", OverheadPlayerDialog.class);
        Dialogs.FACTORIES.put("osamodasSymbiotDialog", OsamodasSymbiotDialog.class);
        Dialogs.FACTORIES.put("partyListDialog", PartyListDialog.class);
        Dialogs.FACTORIES.put("partyListInviteDialog", PartyListInviteDialog.class);
        Dialogs.FACTORIES.put("partySearchDialog", PartySearchDialog.class);
        Dialogs.FACTORIES.put("passportDialog", PassportDialog.class);
        Dialogs.FACTORIES.put("petBubbleDialog", PetBubbleDialog.class);
        Dialogs.FACTORIES.put("petCosmeticsDialog", PetCosmeticsDialog.class);
        Dialogs.FACTORIES.put("petDialog", PetDialog.class);
        Dialogs.FACTORIES.put("petColorPreviewDialog", PetColorPreviewDialog.class);
        Dialogs.FACTORIES.put("playerGiftDialog", PlayerGiftDialog.class);
        Dialogs.FACTORIES.put("popupDialog", PopupDialog.class);
        Dialogs.FACTORIES.put("progressDialog", ProgressDialog.class);
        Dialogs.FACTORIES.put("protectorBudgetAllocateDialog", ProtectorBudgetAllocateDialog.class);
        Dialogs.FACTORIES.put("protectorBudgetTransferDialog", ProtectorBudgetTransferDialog.class);
        Dialogs.FACTORIES.put("protectorManagementDialog", ProtectorManagementDialog.class);
        Dialogs.FACTORIES.put("protectorViewDialog", ProtectorViewDialog.class);
        Dialogs.FACTORIES.put("pvpFightResultDialog", PvpFightResultDialog.class);
        Dialogs.FACTORIES.put("pvpLadderEntryDialog", PvpLadderEntryDialog.class);
        Dialogs.FACTORIES.put("questDialog", QuestDialog.class);
        Dialogs.FACTORIES.put("questActivationDialog", QuestActivationDialog.class);
        Dialogs.FACTORIES.put("questActivatedDialog", QuestActivatedDialog.class);
        Dialogs.FACTORIES.put("questDescriptionDialog", QuestDescriptionDialog.class);
        Dialogs.FACTORIES.put("questListBarDialog", QuestListBarDialog.class);
        Dialogs.FACTORIES.put("reportBugDialog", ReportBugDialog.class);
        Dialogs.FACTORIES.put("recycleDialog", RecycleDialog.class);
        Dialogs.FACTORIES.put("improveGemDialog", ImproveGemDialog.class);
        Dialogs.FACTORIES.put("renameCharacterDialog", RenameCharacterDialog.class);
        Dialogs.FACTORIES.put("runningEffectDetailDialog", RunningEffectDetailDialog.class);
        Dialogs.FACTORIES.put("secondaryShortcutBarDialog", SecondaryShortcutBarDialog.class);
        Dialogs.FACTORIES.put("seedSpreaderDialog", SeedSpreaderDialog.class);
        Dialogs.FACTORIES.put("selectItemElementsDialog", SelectItemElementsDialog.class);
        Dialogs.FACTORIES.put("sessionTimerDialog", SessionTimerDialog.class);
        Dialogs.FACTORIES.put("setDetailDialog", SetDetailDialog.class);
        Dialogs.FACTORIES.put("setPriceDialog", SetPriceDialog.class);
        Dialogs.FACTORIES.put("shukruteRewardDialog", ShukruteRewardDialog.class);
        Dialogs.FACTORIES.put("slotMachineDialog", SlotMachineDialog.class);
        Dialogs.FACTORIES.put("spellsDialog", SpellsDialog.class);
        Dialogs.FACTORIES.put("spellsRestatDialog", SpellsRestatDialog.class);
        Dialogs.FACTORIES.put("splashScreenDialog", SplashScreenDialog.class);
        Dialogs.FACTORIES.put("splitStackDialog", SplitStackDialog.class);
        Dialogs.FACTORIES.put("splitExchangeAmountOfCashDialog", SplitExchangeAmountOfCashDialog.class);
        Dialogs.FACTORIES.put("spellDescriptionDialog", SpellDescriptionDialog.class);
        Dialogs.FACTORIES.put("splashMessageDialog", SplashMessageDialog.class);
        Dialogs.FACTORIES.put("stateBarDialog", StateBarDialog.class);
        Dialogs.FACTORIES.put("stateDetailDialog", StateDetailDialog.class);
        Dialogs.FACTORIES.put("steamLinkAccountDialog", SteamLinkAccountDialog.class);
        Dialogs.FACTORIES.put("storageBoxDialog", StorageBoxDialog.class);
        Dialogs.FACTORIES.put("stuffPreviewDialog", StuffPreviewDialog.class);
        Dialogs.FACTORIES.put("sundialDialog", SundialDialog.class);
        Dialogs.FACTORIES.put("subscriptionEndedDialog", SubscriptionEndedDialog.class);
        Dialogs.FACTORIES.put("systemBarDialog", SystemBarDialog.class);
        Dialogs.FACTORIES.put("messageContainer", MessageContainer.class);
        Dialogs.FACTORIES.put("messageContainer2", MessageContainer2.class);
        Dialogs.FACTORIES.put("messageContainer3", MessageContainer3.class);
        Dialogs.FACTORIES.put("messageContainerChallenge", MessageContainerChallenge.class);
        Dialogs.FACTORIES.put("messageContainerFight", MessageContainerFight.class);
        Dialogs.FACTORIES.put("timePointBonusSelectionDialog", TimePointBonusSelectionDialog.class);
        Dialogs.FACTORIES.put("timePointBarDialog", TimePointBarDialog.class);
        Dialogs.FACTORIES.put("timelineCellDialog", TimelineCellDialog.class);
        Dialogs.FACTORIES.put("timelineCellDialog2", TimelineCellDialog2.class);
        Dialogs.FACTORIES.put("temporaryTransferInventoryDialog", TemporaryTransferInventoryDialog.class);
        Dialogs.FACTORIES.put("tutorialBookDialog", TutorialBookDialog.class);
        Dialogs.FACTORIES.put("tutorialMessageDialog", TutorialMessageDialog.class);
        Dialogs.FACTORIES.put("vaultDialog", VaultDialog.class);
        Dialogs.FACTORIES.put("voteInformationDialog", VoteInformationDialog.class);
        Dialogs.FACTORIES.put("verticalStateBarDialog", VerticalStateBarDialog.class);
        Dialogs.FACTORIES.put("verticalSecondaryShortcutBarDialog", VerticalSecondaryShortcutBarDialog.class);
        Dialogs.FACTORIES.put("verticalFollowedAchievementsDialog", VerticalFollowedAchievementsDialog.class);
        Dialogs.FACTORIES.put("videoDialog", VideoDialog.class);
        Dialogs.FACTORIES.put("videoLoadingDialog", VideoLoadingDialog.class);
        Dialogs.FACTORIES.put("videoCinematicDialog", VideoCinematicDialog.class);
        Dialogs.FACTORIES.put("weatherInfoDialog", WeatherInfoDialog.class);
        Dialogs.FACTORIES.put("weatherInfoSmallDialog", WeatherInfoSmallDialog.class);
        Dialogs.FACTORIES.put("webShopDialog", WebShopDialog.class);
        Dialogs.FACTORIES.put("webShopArticleDialog", WebShopArticleDialog.class);
        Dialogs.FACTORIES.put("worldAndFightBarDialog", WorldAndFightBarDialog.class);
        Dialogs.FACTORIES.put("serverChoiceDialog", ServerChoiceDialog.class);
        Dialogs.FACTORIES.put("buildingEvolutionDialog", BuildingEvolutionDialog.class);
        Dialogs.FACTORIES.put("worldEditorDialog", WorldEditorDialog.class);
        Dialogs.FACTORIES.put("xpGainDialog", XpGainDialog.class);
        Dialogs.FACTORIES.put("zaapDialog", ZaapDialog.class);
    }
}
