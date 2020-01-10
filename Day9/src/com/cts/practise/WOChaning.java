//package com.cts.practise;
//
//public class WOChaining {
//	 
//    public static void main(String[] args) throws Exception {
//        getLeave();
//    }
// 
//    void getLeave() throws NoLeaveGrantedException {
//        try {
//            howIsTeamLead();
//        } catch (TeamLeadUpsetException e) {
//            e.printStackTrace();
//            throw new NoLeaveGrantedException("Leave not sanctioned.");
//        }
//    }
// 
//    void howIsTeamLead() throws TeamLeadUpsetException {
//        throw new TeamLeadUpsetException("Team Lead Upset");
//    }
//}
