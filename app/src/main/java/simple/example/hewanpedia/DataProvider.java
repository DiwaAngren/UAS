package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Burung;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.domestik_nama), "",
                ctx.getString(R.string.domestik_deskripsi), R.drawable.domestik));
        kucings.add(new Kucing(ctx.getString(R.string.persia_nama), "",
                ctx.getString(R.string.persia_deskripsi), R.drawable.persia));
        kucings.add(new Kucing(ctx.getString(R.string.anggora_nama), "",
                ctx.getString(R.string.anggora_deskripsi), R.drawable.anggora));
        kucings.add(new Kucing(ctx.getString(R.string.siam_nama), "",
                ctx.getString(R.string.siam_deskripsi), R.drawable.siam));
        kucings.add(new Kucing(ctx.getString(R.string.ragdoll_nama), "",
                ctx.getString(R.string.ragdoll_deskripsi), R.drawable.ragdoll));
        return kucings;
    }

    private static List<Burung> initDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung(ctx.getString(R.string.murai_batu_nama), "",
                ctx.getString(R.string.murai_batu_deskripsi), R.drawable.muaribatu));
        burungs.add(new Burung(ctx.getString(R.string.kenari_nama), " ",
                ctx.getString(R.string.kenari_deskripsi), R.drawable.kenari));
        burungs.add(new Burung(ctx.getString(R.string.cucak_rowo_nama), "",
                ctx.getString(R.string.cucak_rowo_deskripsi), R.drawable.cucokrowo));
        burungs.add(new Burung(ctx.getString(R.string.cendet_nama), "",
                ctx.getString(R.string.cendet_deskripsi), R.drawable.cendet));
        burungs.add(new Burung(ctx.getString(R.string.panca_warna_nama), "",
                ctx.getString(R.string.panca_warna_deskripsi), R.drawable.pancawarna));
        return burungs;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(ctx.getString(R.string.pomeranian_nama), "",
                ctx.getString(R.string.pomeranian_deskripsi), R.drawable.pomeranian));
        anjings.add(new Anjing(ctx.getString(R.string.poodle_nama), "",
                ctx.getString(R.string.poodle_deskripsi), R.drawable.poodle));
        anjings.add(new Anjing(ctx.getString(R.string.shih_tzu_nama), "",
                ctx.getString(R.string.shih_tzu_deskripsi), R.drawable.shihtzu));
        anjings.add(new Anjing(ctx.getString(R.string.chi_hua_hua_nama), "",
                ctx.getString(R.string.chi_hua_hua_deskripsi), R.drawable.chihuahua));
        anjings.add(new Anjing(ctx.getString(R.string.maltese_nama), "",
                ctx.getString(R.string.maltese_deskripsi), R.drawable.maltese));
        return anjings;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataBurung(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
